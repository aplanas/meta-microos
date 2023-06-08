SUMMARY = "Latin (latine) Dictionary for Aspell"
DESCRIPTION = "A Latin (latine) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "20020503"

RPM_NAME = "aspell-la-20020503-2.14.aarch64.rpm"
RPM_HASH = "6768de268fff72a081d688be1fcdbc155b1ab28309d757e5458d6d2859fbf4940243239cfbb1e5af98b0625a4c65be0e72f529e4a27e94d8efcbc73e99424be1"

RPROVIDES:${PN} += "aspell-la aspell-la(aarch-64) locale(aspell:la)"
RDEPENDS:${PN} += ""

inherit rpm
