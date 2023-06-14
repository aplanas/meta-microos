SUMMARY = "Noto Adlam Unjoined Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
AdlamUnjoined Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-adlamunjoined-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "78191c398ff9268d7a18a92be5d5ed729d47c42c7e4ac60b1d678b089d05426aac39533a559251a87c4386de916ab46ccafdda80033b634f1e7caa15b406c48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-adlamunjoined \
noto-sans-adlamunjoined-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
