SUMMARY = "Cadson Demak fonts"
DESCRIPTION = "Cadson Demak fonts are inspired from an old Thai font design, which give old traditional vibes but works well on modern design."
LICENSE = "OFL-1.1"

PV = "0.0+git.1535343411.3adc93a"

RPM_NAME = "cadsondemak-fonts-0.0+git.1535343411.3adc93a-1.10.noarch.rpm"
RPM_HASH = "56b9fa0f2ce2f6b54c4655f11f8de88a7aac3baf1bcd7c2d69bcfb6b460570da3dd24cc6bd8c321d8026a00c96e5d2bb3551bee90c804ba9b4ab1035eea7b593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cadsondemak-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
