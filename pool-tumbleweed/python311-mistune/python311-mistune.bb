SUMMARY = "Python Markdown parser with renderers and plugins"
DESCRIPTION = "A Python Markdown parser with renderers and plugins, \
compatible with sane CommonMark rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.5"

RPM_NAME = "python311-mistune-2.0.5-1.1.noarch.rpm"
RPM_HASH = "65ec940347dda10801f5f809f74198ed0ec2611cb07714e2733c8f9ac08bd726604b9bc9742a46c5cd6f0cfcaa6dffb207bf019f5efdabaaa408056c01e2efb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mistune) \
python311-mistune \
python3dist(mistune)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
