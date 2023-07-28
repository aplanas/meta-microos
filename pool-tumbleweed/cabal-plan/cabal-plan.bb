SUMMARY = "Library and utility for processing cabal's plan.json file"
DESCRIPTION = "This package provides a library (see 'Cabal.Plan') for decoding 'plan.json' \
files as well as the simple tool 'cabal-plan' for extracting and pretty \
printing the information contained in the 'plan.json' file. \
 \
'plan.json' files are generated by \
[cabal](https://hackage.haskell.org/package/cabal-install)'s [Nix-style local \
builds](http://cabal.readthedocs.io/en/latest/nix-local-build.html) and contain \
detailed information about the build/install plan computed by the cabal solver. \
 \
== 'cabal-plan' utility \
 \
The 'cabal-plan' executable (enabled via the 'exe' cabal flag) provides various \
operations: \
 \
[info] Show basic report of dependency tree [show] Dump 'PlanJson' \
data-structure via 'Show' instance [tred] Show dependency tree as a graph \
[diff] Diff two install plans [list-bins] List all binaries [list-bin] List \
single binary (useful for scripting, e.g. 'cabal list-bin exe:cabal-plan') \
[fingerprint] Print SHA256 sums of dependencies' source tarballs and cabal \
files [dot] Generate graph of dependencies in '.dot' format [topo] Print plan \
topologically sorted [license-report] Generate license report for a component \
(only available when built with 'license-report' flag enabled); see \
<src/example/cabal-plan.md report example for cabal-plan> \
(<src/example/cabal-plan.html Pandoc rendered HTML>) \
 \
See also ['New things in Haskell package QA' \
Blogpost](https://oleg.fi/gists/posts/2018-01-08-haskell-package-qa.html) for a \
description of the 'topo' and 'dot' operations as well as how to enable \
tab-completion."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3.0"

RPM_NAME = "cabal-plan-0.7.3.0-2.1.aarch64.rpm"
RPM_HASH = "1664ffdd68f22f414b0af6094f74cdbc58c57ae42080bb12fe9b209716c9f7b96196ef9219212848fca6c46cbab16ed852bae62fb074b5635c5f483174a69fb5"

RPROVIDES:${PN} += "cabal-plan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
