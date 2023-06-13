SUMMARY = "Convert gettext PO files to JSON"
DESCRIPTION = "Convert gettext PO files to JSON objects so that you can use it in your \
application."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "ruby3.2-rubygem-po_to_json-1.0.1-1.29.aarch64.rpm"
RPM_HASH = "a92f39d140b489995403f369d2e7e89d25cd4f74cde63c1698eee208027be2bea074fe3ae368ca946fb2cc55f65b08a1628b99088f6aaea4f71670b894cd4959"

RPROVIDES:${PN} += "ruby3.2-rubygem-po_to_json \
ruby3.2-rubygem-po_to_json(aarch-64) \
rubygem(po_to_json) \
rubygem(ruby:3.2.0:po_to_json) \
rubygem(ruby:3.2.0:po_to_json:1) \
rubygem(ruby:3.2.0:po_to_json:1.0) \
rubygem(ruby:3.2.0:po_to_json:1.0.1)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:json)"

inherit rpm
