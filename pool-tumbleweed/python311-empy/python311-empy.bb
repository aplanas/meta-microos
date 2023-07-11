SUMMARY = "A templating system for Python"
DESCRIPTION = "EmPy is a system for embedding Python expressions and statements \
in template text; it takes an EmPy source file, processes it, and \
produces output.  This is accomplished via expansions, which are \
special signals to the EmPy system and are set off by a special \
prefix (by default the at sign, '@').  EmPy can expand arbitrary \
Python expressions and statements in this way, as well as a \
variety of special forms.  Textual data not explicitly delimited \
in this way is sent unaffected to the output, allowing Python to \
be used in effect as a markup language.  Also supported are 'hook' \
callbacks, recording and playback via diversions, and dynamic, \
chainable filters.  The system is highly configurable via command \
line options and embedded commands."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.4"

RPM_NAME = "python311-empy-3.3.4-1.20.noarch.rpm"
RPM_HASH = "f7747cb0dd4425729dfabbb744ba318a2a376b53e99424048478cd4c2e11e1fab5eb9af229160f76c1ab30a3bdf47077cc86393a16fd512a284065406b17dbb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-empy \
python3.11dist-empy \
python311-empy \
python3dist-empy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
