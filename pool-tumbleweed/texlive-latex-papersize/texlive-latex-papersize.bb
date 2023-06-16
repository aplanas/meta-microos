SUMMARY = "Calculate LaTeX settings for any font and paper size"
DESCRIPTION = "The package is a Python script, whose typical use is when \
preparing printed material for users with low vision. The most \
effective way of doing this is to print on (notional) small \
paper, and then to magnify the result; the script calculates \
the settings for various font and paper sizes. More details are \
to be read in the script itself."
LICENSE = "Apache-1.0"

PV = "2023.201.1.63svn53131"

RPM_NAME = "texlive-latex-papersize-2023.201.1.63svn53131-55.1.noarch.rpm"
RPM_HASH = "52b6ed3f6b95acf4f09f52a4e4041b3f0b468b8bdcd2e583481e8077ccb1f7382f9da7ced82959c99e30d00a89f1e5dbd669d4f38d67042ed1023b29622dd586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-papersize"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex-papersize-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
