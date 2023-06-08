SUMMARY = "Haskell simple-sendfile library development files"
DESCRIPTION = "This package provides the Haskell simple-sendfile library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.31"

RPM_NAME = "ghc-simple-sendfile-devel-0.2.31-1.1.aarch64.rpm"
RPM_HASH = "393b328690e634bf89e3a659a7aaa18d99674030537c5bd431d5d449866f51ab86541b9b7c4b7203f644fa073ff5d6636bd99421024d171586041651fc16c58f"

RPROVIDES:${PN} += "ghc-devel(simple-sendfile-0.2.31-701wssQD34oFyvrTLOblUT) ghc-simple-sendfile-devel ghc-simple-sendfile-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) ghc-devel(unix-2.7.3) ghc-simple-sendfile"

inherit rpm
