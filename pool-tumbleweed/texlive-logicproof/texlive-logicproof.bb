SUMMARY = "Box proofs for propositional and predicate logic"
DESCRIPTION = "A common style of proof used in propositional and predicate \
logic is Fitch proofs, in which each line of the proof has a \
statement and a justification, and subproofs within a larger \
proof have boxes around them. The package provides environments \
for typesetting such proofs and boxes. It creates proofs in a \
style similar to that used in 'Logic in Computer Science' by \
Huth and Ryan."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn33254"

RPM_NAME = "texlive-logicproof-2023.201.svn33254-54.1.noarch.rpm"
RPM_HASH = "17590effa3390f48a935020bfe11bbb947fee41230cb40edafa9f72dec7384c6246c56ed73c23523642831cceb62f2680b1085666eda8e14c0cf49bbd51fe2ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logicproof.sty \
texlive-logicproof"

RDEPENDS:${PN} += "/bin/sh \
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
