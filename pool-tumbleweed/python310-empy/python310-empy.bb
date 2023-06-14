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

RPM_NAME = "python310-empy-3.3.4-1.19.noarch.rpm"
RPM_HASH = "ce9ccc9908a86aa28ce0e1aa4e17c3737cb82480117a35d18a548f2ea5c36efea47d8652e4a0d9054ddd0046a04a1505f6fcc911d69ca8bf3d580b2d54c2be20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-empy \
python3.10dist-empy \
python310-empy \
python3dist-empy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
