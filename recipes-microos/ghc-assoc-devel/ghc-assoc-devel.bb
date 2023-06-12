SUMMARY = "Haskell assoc library development files"
DESCRIPTION = "This package provides the Haskell assoc library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-assoc-devel-1.0.2-7.3.aarch64.rpm"
RPM_HASH = "5580bf7484a15359c61c9c52c8d02f05199058031d79144c74c6567e04776b906cf777cd466c56094f88ee7411be68b00f6555a2ca0ab9f6e3d8f9415051c1dc"

RPROVIDES:${PN} += "ghc-assoc-devel \
ghc-assoc-devel(aarch-64) \
ghc-devel(assoc-1.0.2-IAwklVGxRFw6xcadvaWWl7)"
RDEPENDS:${PN} += "/bin/sh \
ghc-assoc \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL) \
ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa)"

inherit rpm
