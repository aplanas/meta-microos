SUMMARY = "Additional formats"
DESCRIPTION = "Collected TeX `formats', i.e., large-scale macro packages \
designed to be dumped into .fmt files -- excluding the most \
common ones, such as latex and context, which have their own \
package(s). It also includes the Aleph engine and related Omega \
formats and packages, and the HiTeX engine and related."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn62226"

RPM_NAME = "texlive-collection-formatsextra-2023.208.svn62226-60.1.noarch.rpm"
RPM_HASH = "06e348c7ecca48dd63e901129ec10f2ae02308b79b1597f63aef33f8513cbdb789a296f040451e84323ad41368b88a1480d1d6bd76d344a5e9c57e6a57f803df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-formatsextra"

RDEPENDS:${PN} += "texlive-aleph \
texlive-antomega \
texlive-collection-basic \
texlive-collection-latex \
texlive-edmac \
texlive-eplain \
texlive-hitex \
texlive-jadetex \
texlive-lambda \
texlive-lollipop \
texlive-mltex \
texlive-mxedruli \
texlive-omega \
texlive-omegaware \
texlive-otibet \
texlive-passivetex \
texlive-psizzl \
texlive-startex \
texlive-texsis \
texlive-xmltex \
texlive-xmltexconfig"

inherit rpm
