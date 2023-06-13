SUMMARY = "Haskell wai library development files"
DESCRIPTION = "This package provides the Haskell wai library development files."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "ghc-wai-devel-3.2.3-2.2.aarch64.rpm"
RPM_HASH = "58e12dabddd84e36f9d0ffd15b063e1b6ce64e5ab52b629a380e8e4a86ec6ee6d0ef2fb2bfadcf32ed1045c5eb9dda46bc532ee0a653826d8a26fe8c5f87263f"

RPROVIDES:${PN} += "ghc-devel(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-wai-devel \
ghc-wai-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-devel(text-2.0.2) \
ghc-devel(vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc) \
ghc-wai"

inherit rpm
