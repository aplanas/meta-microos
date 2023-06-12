SUMMARY = "A thesis class file for York University, Toronto"
DESCRIPTION = "York Graduate Studies has again changed the requirements for \
theses and dissertations. The established york-thesis class \
file now implements the changes made in Spring 2005."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn23348"

RPM_NAME = "texlive-york-thesis-2023.201.3.6svn23348-52.1.noarch.rpm"
RPM_HASH = "38e28454217d6a69761a710fbe5ce60ba05f13854bb95e805cd8405ae33739ba5e4135273f1cef5e89b5a2afd64f9139279d20657eaabc9776ceae909bddfb50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(york-thesis.cls) \
texlive-york-thesis"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(ifthen.sty) \
tex(makeidx.sty) \
tex(report.cls) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
