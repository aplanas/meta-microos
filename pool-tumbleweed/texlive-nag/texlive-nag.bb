SUMMARY = "Detecting and warning about obsolete LaTeX commands"
DESCRIPTION = "Old habits die hard. All the same, there are commands, classes \
and packages which are outdated and superseded. The nag package \
provides routines to warn the user about the use of such \
obsolete things. As an example, we provide an extension that \
detects many of the 'sins' described in l2tabu."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn24741"

RPM_NAME = "texlive-nag-2023.209.0.0.7svn24741-55.1.noarch.rpm"
RPM_HASH = "758e7a608b4fb3b1e243d2289211e4d27aa1d9e013a34c5ed9e4de2107ddf09ee196de66dead87a8fb2590ca0329c5f565b86d2c87759dae25f674a1e8802525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nag-abort.cfg \
tex-nag-experimental.cfg \
tex-nag-l2tabu.cfg \
tex-nag-orthodox.cfg \
tex-nag.sty \
texlive-nag"

RDEPENDS:${PN} += "/usr/bin/sh \
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
