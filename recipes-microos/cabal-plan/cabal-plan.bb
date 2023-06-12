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

PV = "0.7.2.3"

RPM_NAME = "cabal-plan-0.7.2.3-1.3.aarch64.rpm"
RPM_HASH = "f4c0fb043972601bcb93b111c0d1fee1dde73fc7a36cb1b7fa7806c1bda884e1bad97259718d2ed16a8f5cae56c1a19dc8f43289a78d3c6f81a1c0449fe41b34"

RPROVIDES:${PN} += "cabal-plan \
cabal-plan(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatomic.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm
