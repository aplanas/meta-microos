SUMMARY = "Haskell tls-session-manager library development files"
DESCRIPTION = "This package provides the Haskell tls-session-manager library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-devel-0.0.4-4.6.aarch64.rpm"
RPM_HASH = "e7d3aada3b8bda9159c2fafc612a20f4cd893002401dcacbc1d7df32746b2dffec8e9f86b038da3d5957784cba5d5649ce9a66d586e2d058839468fe71c714dd"

RPROVIDES:${PN} += "ghc-devel-tls-session-manager-0.0.4-BZhuXicA1j0A1xtOmVohoA \
ghc-tls-session-manager-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc \
ghc-devel-base-4.17.2.0 \
ghc-devel-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-clock-0.8.4-FaEd7XcSjZTFKcoXlUaX3W \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-devel-psqueues-0.2.7.3-HjZq7FmM1u5AN66Kt7is6C \
ghc-devel-tls-1.6.0-D0DtS2mRMN13yCvXOGSBsv \
ghc-tls-session-manager"

inherit rpm
