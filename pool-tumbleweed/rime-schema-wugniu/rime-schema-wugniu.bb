SUMMARY = "wugniu input schema for rime"
DESCRIPTION = "wugniu input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-wugniu-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "08c3fb558739342e5ebb6894b72e2d16a243b01a2c18a5c5cf3aecc26ed89300338abefd994fc330860b737bce45b278176a3ce1242c7881a2f4bbc7a8a4d271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-wugniu"

RDEPENDS:${PN} += ""

inherit rpm
