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

RPM_NAME = "python311-zope.deferredimport-4.4-3.3.noarch.rpm"
RPM_HASH = "a61295f741b2bb895d8e446dca0b0a6b9305f70d4d5509cb12cc7d2bd0b7099dfc4e89b3099cbab8626a2e7835c75ddf902726a04139233d710b75d497175dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.deferredimport \
python3.11dist-zope.deferredimport \
python311-zope.deferredimport \
python3dist-zope.deferredimport"

RDEPENDS:${PN} += "python-abi \
python311-zope.proxy"

inherit rpm
