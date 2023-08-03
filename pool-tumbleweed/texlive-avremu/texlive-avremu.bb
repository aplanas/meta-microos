SUMMARY = "An 8-Bit Microcontroller Simulator written in LaTeX"
DESCRIPTION = "A fully working package to simulate a Microprocessor in pure \
LaTeX. The simulator is able to calculate complex pictures, \
like Mandelbrot sets."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn35373"

RPM_NAME = "texlive-avremu-2023.209.0.0.1svn35373-54.1.noarch.rpm"
RPM_HASH = "8b0ec65b99ac0e4bb2d0dc74e8d448d2e37902fffc22e6222ed1d535e24270d3a67dca7de96370dc6e8d4a7ef8a996591066de5aadf87eed88f527e61a539369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-avr.binary.tex \
tex-avr.bitops.tex \
tex-avr.draw.tex \
tex-avr.instr.tex \
tex-avr.io.tex \
tex-avr.memory.tex \
tex-avr.numbers.tex \
tex-avr.testsuite.tex \
tex-avremu.sty \
texlive-avremu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
