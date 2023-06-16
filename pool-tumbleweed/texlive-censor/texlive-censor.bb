SUMMARY = "Tools for producing redacted documents"
DESCRIPTION = "This package provides simple tools for creating redacted \
documents with blacked-out text. Its tools are useful both for \
creating documents in a restricted environment (for redacted \
release in an unrestricted environment) as well as in an \
unrestricted environment (for eventual transfer and completion \
in the restricted environment)."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn63126"

RPM_NAME = "texlive-censor-2023.201.4.2svn63126-52.1.noarch.rpm"
RPM_HASH = "c95725d7fdcfea7309f69c97424c8bf6f0f3a1ad19f6c58d7e636b5d4cb760fcb3925e96ee9b82f6bb8681f41927a8161bbd6c59598e632d74da12251a13a420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-censor.sty \
texlive-censor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pbox.sty \
tex-tokcycle.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
