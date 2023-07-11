SUMMARY = "GNU/Linux Desktop featuring a traditional layout -- GSchemas"
DESCRIPTION = "This package provides GSettings schemas for \
Cinnamon Desktop Environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "5.2.7"

RPM_NAME = "cinnamon-gschemas-5.2.7-2.8.aarch64.rpm"
RPM_HASH = "2f562357bf6b08ec2df4a471df9dba38f5b79ab881bff5ff7475474d632004a7b9cdf77e5d4ce4818f190c02af035d8bfef5da836ae3f664c15fa5b6d8658383"

RPROVIDES:${PN} += "cinnamon-gschemas"

RDEPENDS:${PN} += "cinnamon-gschemas-branding"

inherit rpm
