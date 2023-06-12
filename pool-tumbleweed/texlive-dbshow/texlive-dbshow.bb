SUMMARY = "A package to store and display data with custom filters, orders, and styles"
DESCRIPTION = "The package provides four core functions: data storage and \
display data filtering data sorting data display All data is \
saved once and then you can display these data with custom \
filters, orders and styles. The package can be used, for \
example, to record and display something you'd like to review, \
maybe the question you always answered incorrectly or some \
forgettable knowledge. But obviously, the package is much more \
powerful and extensible for more interesting tasks depending on \
the individual."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn61634"

RPM_NAME = "texlive-dbshow-2023.201.1.5svn61634-52.1.noarch.rpm"
RPM_HASH = "4ca76acca9b767d7a469cbc2532ded49382baabf6582991085309559c8e562e0ecaff9a346391163e9c1a105e3cec09d6e0fa8a9e0434bf3a3c698a4e73f9975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dbshow.sty) \
texlive-dbshow"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
