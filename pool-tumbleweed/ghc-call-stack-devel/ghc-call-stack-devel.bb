SUMMARY = "Haskell call-stack library development files"
DESCRIPTION = "This package provides the Haskell call-stack library development files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-devel-0.4.0-2.6.aarch64.rpm"
RPM_HASH = "7c229b1dbdf7c4b5d59aa90be47f0af5090544ed205e4e2663e400bcc80d8e2e056d3a86e1998a211ef39ec1718666fe22b64fa04577e80a482b9922867157b9"

RPROVIDES:${PN} += "ghc-call-stack-devel \
ghc-devel-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-call-stack \
ghc-compiler \
ghc-devel-base-4.17.1.0"

inherit rpm
