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

RPM_NAME = "python311-textwrap3-0.9.2-1.14.noarch.rpm"
RPM_HASH = "3990bf62e428b236573f2221cce67e10aa3fa4f69ff638b33f65e523dffbed1b991ca01204501d71885b82eaf9f6ab8be176c2b11d01194c5e37ad21539186e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(textwrap3) \
python311-textwrap3 \
python3dist(textwrap3)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
