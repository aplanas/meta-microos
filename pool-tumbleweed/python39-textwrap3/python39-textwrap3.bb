SUMMARY = "Textwrap from Python 3.6 backport (plus a few tweaks)"
DESCRIPTION = "Textwrap3 is a compatibility back-port of Python 3.6's textwrap \
module that supports Python 2.6 forward. This makes a few new \
APIs such as shorten and the max_lines parameter available \
in a compatible way to all Python versions typically in current use. \
 \
By design, Python 3 sensibilities and expectations rule. Especially when \
processing text that includes Unicode characters, textwrap3's results may \
differ a bit from those of the textwrap of the underlying Python version \
(esp. 2.x). In particular, textwrap3 uses the re.UNICODE flag so that \
non-ASCII characters such as accented letters are considered legitimate word \
characters. \
 \
It also adds one tweak, considering the Unicode em-dash \
('\\N{EM DASH}' or u'\\u2014') identical to the simulated ASCII em-dash \
'--'."
LICENSE = "Python-2.0"

PV = "0.9.2"

RPM_NAME = "python39-textwrap3-0.9.2-1.16.noarch.rpm"
RPM_HASH = "6b4692954f9615d0a478ceebef1e883943fa990af80055ce753d802eace314b2ffdf2be85ce4d235e20b40a9e0755db77d9b79d59a60046135e988476449d7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-textwrap3 \
python39-textwrap3 \
python3dist-textwrap3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
