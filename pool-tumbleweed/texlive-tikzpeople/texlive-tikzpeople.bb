SUMMARY = "Draw people-shaped nodes in TikZ"
DESCRIPTION = "This package provides people-shaped nodes in the style of \
Microsoft Visio clip art, to be used with TikZ. The available, \
highly customizable, node shapes are: alice, bob, bride, \
builder, businessman, charlie, chef, conductor, cowboy, \
criminal, dave, devil, duck, graduate, groom, guard, jester, \
judge, maininblack, mexican, nun, nurse, physician, pilot, \
police, priest, sailor, santa, surgeon."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn43978"

RPM_NAME = "texlive-tikzpeople-2023.209.0.0.4svn43978-53.1.noarch.rpm"
RPM_HASH = "9baa7c1d7f4bcdad39eac8a40dcfca31b4125dd64b937674e3e77f62ae8ea352cf29c972cd513d61803a1fb1f35f1555602283a9fdc3cab08d7e3733313c6b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzpeople.shape.alice.sty \
tex-tikzpeople.shape.bob.sty \
tex-tikzpeople.shape.bride.sty \
tex-tikzpeople.shape.builder.sty \
tex-tikzpeople.shape.businessman.sty \
tex-tikzpeople.shape.charlie.sty \
tex-tikzpeople.shape.chef.sty \
tex-tikzpeople.shape.conductor.sty \
tex-tikzpeople.shape.cowboy.sty \
tex-tikzpeople.shape.criminal.sty \
tex-tikzpeople.shape.dave.sty \
tex-tikzpeople.shape.devil.sty \
tex-tikzpeople.shape.duck.sty \
tex-tikzpeople.shape.graduate.sty \
tex-tikzpeople.shape.groom.sty \
tex-tikzpeople.shape.guard.sty \
tex-tikzpeople.shape.jester.sty \
tex-tikzpeople.shape.judge.sty \
tex-tikzpeople.shape.maninblack.sty \
tex-tikzpeople.shape.mexican.sty \
tex-tikzpeople.shape.nun.sty \
tex-tikzpeople.shape.nurse.sty \
tex-tikzpeople.shape.physician.sty \
tex-tikzpeople.shape.pilot.sty \
tex-tikzpeople.shape.police.sty \
tex-tikzpeople.shape.priest.sty \
tex-tikzpeople.shape.sailor.sty \
tex-tikzpeople.shape.santa.sty \
tex-tikzpeople.shape.surgeon.sty \
tex-tikzpeople.sty \
texlive-tikzpeople"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-capt-of.sty \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xifthen.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
