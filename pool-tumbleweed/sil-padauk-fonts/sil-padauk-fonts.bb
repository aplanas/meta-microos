SUMMARY = "Smart Unicode Font for the Myanmar Script"
DESCRIPTION = "As part of the Unicode development effort, the encoding for the Myanmar \
script is being extended. These changes are being voted on as part of a \
PDAM and as such fonts that support these encoding extensions are not \
officially Unicode compliant with any current version of Unicode. \
Padauk conforms to the proposed extensions in anticipation of their \
being accepted into the Unicode standard. \
 \
Users wishing to find a font capable of supporting Unicode data today \
should look elsewhere. They should also be made aware that assuming the \
extensions are accepted into Unicode, then they will need to transcode \
their data to continue to be conforming. \
 \
Padauk supports the Myanmar script extensions including changes to how \
Burmese is encoded, Sgaw Karen and Mon. Padauk continues to be \
developed so should you find problems with the font, please send \
feedback to SIL_fonts@sil.org.	Requirements \
 \
Padauk includes the necessary Graphite smarts to render Myanmar script \
correctly. Thus if you want to use this font you will need the Graphite \
libraries and Graphite capable applications or graphics extensions."
LICENSE = "OFL-1.1"

PV = "2.2"

RPM_NAME = "sil-padauk-fonts-2.2-84.17.noarch.rpm"
RPM_HASH = "0f157f6a870aa8dd07497daf72ad4498eeb0247deda2a9ee1170d733461213e71c5278f138720cfa15c5410b04252e2bcf46be2ea8d5a82b1253360d751abb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(my) \
sil-padauk \
sil-padauk-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
