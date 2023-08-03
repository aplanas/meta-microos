SUMMARY = "Box proofs for propositional and predicate logic"
DESCRIPTION = "A common style of proof used in propositional and predicate \
logic is Fitch proofs, in which each line of the proof has a \
statement and a justification, and subproofs within a larger \
proof have boxes around them. The package provides environments \
for typesetting such proofs and boxes. It creates proofs in a \
style similar to that used in 'Logic in Computer Science' by \
Huth and Ryan."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn33254"

RPM_NAME = "texlive-logicproof-2023.209.svn33254-55.1.noarch.rpm"
RPM_HASH = "e94f9d07e54b2dd3e1db1446a006ac76b693a1b9a363ab61bc88ff2506993dbd03f4b4de456b65356e1db4a1bd93095dd99dce1f4c8d8858ad737cc93e56603a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logicproof.sty \
texlive-logicproof"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
