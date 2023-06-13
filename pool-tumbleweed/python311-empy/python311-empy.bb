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

RPM_NAME = "python311-empy-3.3.4-1.19.noarch.rpm"
RPM_HASH = "1b0e5cdf7412feeaec95aadbf562ea77bea1dcbb01806659528c29e4d74fa30e8e53ac679f2bdec17d292a5b671ddb63fe9ad992301f0d8093849e3fa734bff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(empy) \
python311-empy \
python3dist(empy)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
