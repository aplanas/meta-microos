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

RPM_NAME = "python310-textwrap3-0.9.2-1.16.noarch.rpm"
RPM_HASH = "b44ecab91e6056a9b630142ebfb70a26381743718ecd77cbe856f9f951b95b2ae7f647df606ca9f65020f1e03e2cc05b8e524d090571d82799fad9ba71a760fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-textwrap3 \
python310-textwrap3 \
python3dist-textwrap3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
