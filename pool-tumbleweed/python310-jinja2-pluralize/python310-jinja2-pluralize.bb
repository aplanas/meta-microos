SUMMARY = "Jinja2 pluralize filters"
DESCRIPTION = "Jinja2 pluralize filters."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python310-jinja2-pluralize-0.3.0-2.8.noarch.rpm"
RPM_HASH = "f0387fbd5d72724cef0749fb2e760e5244b381dced97b50053f077a2cafc5009ddfc44112157078633c8f9e739d79e06edb8eadd1bdb3bfabc35ac30de6443ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jinja2-pluralize \
python3.10dist(jinja2-pluralize) \
python310-jinja2-pluralize \
python3dist(jinja2-pluralize)"
RDEPENDS:${PN} += "python(abi) \
python310-Jinja2 \
python310-inflect"

inherit rpm
