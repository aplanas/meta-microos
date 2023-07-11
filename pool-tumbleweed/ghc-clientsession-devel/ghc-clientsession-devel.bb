SUMMARY = "Haskell clientsession library development files"
DESCRIPTION = "This package provides the Haskell clientsession library development files."
LICENSE = "MIT"

PV = "0.9.1.2"

RPM_NAME = "ghc-clientsession-devel-0.9.1.2-4.6.aarch64.rpm"
RPM_HASH = "77f9abb305229f5d7b3cab976ddc9d6af392ecfc9ebe1470ab15ca4d8e6dd28bf6050b2eef7aca536377dbfdb77443fc1e5abef83538e8a5cea0f4462b5f8921"

RPROVIDES:${PN} += "ghc-clientsession-devel \
ghc-devel-clientsession-0.9.1.2-LlqL6bYAJ8NAeAYS4avg1k"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-clientsession \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-devel-cipher-aes-0.2.11-AUtsAMArdsjvHtn454bNK \
ghc-devel-cprng-aes-0.6.1-57mLrS8iLhhDpycOALP7vk \
ghc-devel-crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE \
ghc-devel-crypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw \
ghc-devel-directory-1.3.7.1 \
ghc-devel-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP \
ghc-devel-setenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x \
ghc-devel-skein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa"

inherit rpm
