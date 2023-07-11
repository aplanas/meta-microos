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

RPM_NAME = "python310-empy-3.3.4-1.20.noarch.rpm"
RPM_HASH = "6271c4a13c28f1ef16b06ace31c159c8a99b0b41ccd397194ce3228ab1aa6892f5b9a38abe2b0d7860b3bc957eeeeefa1d528dc20bd88706f7fa1406ae38f612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-empy \
python310-empy \
python3dist-empy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
