SUMMARY = "Haskell bencode library development files"
DESCRIPTION = "This package provides the Haskell bencode library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-devel-0.6.1.1-4.3.aarch64.rpm"
RPM_HASH = "08727ae5b55831cba937bd61de952da0bf5ab5e2fc0d4fa756a72b4ad79f21a006d61cdf63549c6633d92af92d4433b68fa4e4c55154f9f0a6869a10cf29044a"

RPROVIDES:${PN} += "ghc-bencode-devel \
ghc-bencode-devel(aarch-64) \
ghc-devel(bencode-0.6.1.1-GM7FbH3LNxfAWaUPR0lH5w)"

RDEPENDS:${PN} += "/bin/sh \
ghc-bencode \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(binary-0.8.9.1) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd)"

inherit rpm
