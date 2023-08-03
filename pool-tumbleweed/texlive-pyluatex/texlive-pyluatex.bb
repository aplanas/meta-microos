SUMMARY = "Execute Python code on the fly in your LaTeX documents"
DESCRIPTION = "PyLuaTeX allows you to execute Python code and to include the \
resulting output in your LaTeX documents in a single \
compilation run. LaTeX documents must be compiled with LuaLaTeX \
for this to work. PyLuaTeX runs a Python InteractiveInterpreter \
(actually several if you use different sessions) in the \
background for on-the-fly code execution. Python code from your \
LaTeX file is sent to the background interpreter through a TCP \
socket. This approach allows your Python code to be executed \
and the output to be integrated in your LaTeX file in a single \
compilation run. No additional processing steps are needed. No \
intermediate files have to be written. No placeholders have to \
be inserted."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6.1svn65855"

RPM_NAME = "texlive-pyluatex-2023.209.0.0.6.1svn65855-54.1.noarch.rpm"
RPM_HASH = "cc9501fce69d76b00c5bf8d79f305e08e205ac1930b73e1053574fcbe07b83c0462a845721c832dbc0522e530e9da48b6af59b7d837e97f4c8132b77c68114db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pyluatex.sty \
texlive-pyluatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-expl3.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
