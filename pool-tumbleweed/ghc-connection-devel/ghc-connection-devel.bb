SUMMARY = "Haskell connection library development files"
DESCRIPTION = "This package provides the Haskell connection library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-connection-devel-0.3.1-7.2.aarch64.rpm"
RPM_HASH = "055b1453dc3794d0b380d53dbb86607a60982f2f3a798ebd87a3f5710f47236e6569a51ab8e607ef5ed3f90b0d3e98ce5bd76e78b830f6ac3f7e50dcbb5f2c3e"

RPROVIDES:${PN} += "ghc-connection-devel \
ghc-devel-connection-0.3.1-IDyFh0K8hgZvp3uiDVm7m"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-connection \
ghc-devel-base-4.17.1.0 \
ghc-devel-basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-devel-socks-0.6.1-CAd82jbrmKj2bUx8fkWhGg \
ghc-devel-tls-1.6.0-48osxqPawrs8SblkErmTaM \
ghc-devel-x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw \
ghc-devel-x509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt \
ghc-devel-x509-system-1.6.7-BOgSBhUS7jg4riLu2Dt4H7 \
ghc-devel-x509-validation-1.6.12-JQgBIAyKHQDDBxJK8FYPfO"

inherit rpm
