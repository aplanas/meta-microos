SUMMARY = "Print various kinds 2/5 and Code 39 bar codes"
DESCRIPTION = "The package contains macros for printing various 2/5 bar codes \
and Code 39 bar codes. The macros do not use fonts but create \
the bar codes directly using vertical rules. It is therefore \
possible to vary width to height ratio, ratio of thin and thick \
bars. The package is therefore convenient for printing ITF bar \
codes as well as bar codes for identification labels for HP \
storage media."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-makebarcode-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "9a03de2ceca81f6fc4472c99f8f70913c1ab5dc21e7f9a57b652c93bd1d27a369db61b48639325920072b6ae670491e2596372823599ab152f1f842da80bbcff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(makebarcode.sty) \
texlive-makebarcode"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
