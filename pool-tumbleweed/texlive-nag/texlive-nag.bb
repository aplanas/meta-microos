SUMMARY = "Detecting and warning about obsolete LaTeX commands"
DESCRIPTION = "Old habits die hard. All the same, there are commands, classes \
and packages which are outdated and superseded. The nag package \
provides routines to warn the user about the use of such \
obsolete things. As an example, we provide an extension that \
detects many of the 'sins' described in l2tabu."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn24741"

RPM_NAME = "texlive-nag-2023.201.0.0.7svn24741-54.1.noarch.rpm"
RPM_HASH = "f3bfef7ccd729100adbcfe67173877fc6959db9ad99a760562e94c531207f07cf0e237ca18eaffd8e6923114efb32dd8ad02c43207d329cb186ea582bf888132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nag-abort.cfg) \
tex(nag-experimental.cfg) \
tex(nag-l2tabu.cfg) \
tex(nag-orthodox.cfg) \
tex(nag.sty) \
texlive-nag"
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
