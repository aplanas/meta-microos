SUMMARY = "Prepare a package for upload to CTAN"
DESCRIPTION = "Given a list of filenames, ctanify creates a tarball (a .tar.gz \
file) with the files laid out in CTAN's preferred structure. By \
default this tarball additionally contains a ZIP (.zip) file \
with copies of all files laid out in the standard TeX Directory \
Structure (TDS), which may be used by those intending to \
install the package, or by those who need to incorporate it in \
a distribution. (The TDS ZIP file will be installed in the CTAN \
install/ tree.) Given that CTAN and TeX Live are not fond of \
.tds.zip files for small and/or otherwise straightforward \
packages, ctanify has now been provided with an option that \
prevents the creation and inclusion of such a .tds.zip file."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.1svn44129"

RPM_NAME = "texlive-ctanify-2023.209.1.9.1svn44129-55.1.noarch.rpm"
RPM_HASH = "16d6dff9e37a733d3d7d087514d31027e95ee5925831487d7edfc9a0ca023b256eae9220ec4e7a07ad1b3aaad8cf35fab347577a474a648efeaeaf23ccd93b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctanify"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-File--Copy--Recursive \
perl-File--Find \
perl-File--Path \
perl-File--Spec \
perl-File--Temp \
perl-File--stat \
perl-Getopt--Long \
perl-Pod--Usage \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-ctanify-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
