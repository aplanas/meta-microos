SUMMARY = "Haskell clientsession profiling library"
DESCRIPTION = "This package provides the Haskell clientsession profiling library."
LICENSE = "MIT"

PV = "0.9.1.2"

RPM_NAME = "ghc-clientsession-prof-0.9.1.2-4.6.aarch64.rpm"
RPM_HASH = "88a929611339900128087b054144419af5733b551f5833b982faac705f4e6b150387b92c35ee49d10f754f35417adec7d1efb89baca756e5098b87416fd70666"

RPROVIDES:${PN} += "ghc-clientsession-prof \
ghc-prof-clientsession-0.9.1.2-LlqL6bYAJ8NAeAYS4avg1k"

RDEPENDS:${PN} += "ghc-clientsession-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-cipher-aes-0.2.11-AUtsAMArdsjvHtn454bNK \
ghc-prof-cprng-aes-0.6.1-57mLrS8iLhhDpycOALP7vk \
ghc-prof-crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE \
ghc-prof-crypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw \
ghc-prof-directory-1.3.7.1 \
ghc-prof-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP \
ghc-prof-setenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x \
ghc-prof-skein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa"

inherit rpm
