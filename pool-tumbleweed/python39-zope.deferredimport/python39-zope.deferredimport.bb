SUMMARY = "On-demand import name resolver"
DESCRIPTION = "Often, especially for package modules, you want to import names for \
convenience, but not actually perform the imports until necessary. \
The zope.deferredimport package provided facilities for defining names \
in modules that will be imported from somewhere else when used.  You \
can also cause deprecation warnings to be issued when a variable is \
used. \
 \
Documentation is hosted at https://zopedeferredimport.readthedocs.io/"
LICENSE = "ZPL-2.1"

PV = "4.4"

RPM_NAME = "python39-zope.deferredimport-4.4-3.3.noarch.rpm"
RPM_HASH = "32857ca5cfb4945976ae135bd7caaa66672c99083a51321c31798c77eba4154af9eb19db5d95033c8dc20e21b90062f9db31bcfe771ef0bc84e857a961dc85a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.deferredimport \
python39-zope.deferredimport \
python3dist-zope.deferredimport"

RDEPENDS:${PN} += "python-abi \
python39-zope.proxy"

inherit rpm
