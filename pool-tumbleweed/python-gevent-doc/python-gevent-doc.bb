SUMMARY = "Documentation for python-gevent"
DESCRIPTION = "Documentation and examples for python-gevent."
LICENSE = "MIT"

PV = "23.7.0"

RPM_NAME = "python-gevent-doc-23.7.0-1.1.noarch.rpm"
RPM_HASH = "e269e4958d0ac34b0b0506a9826480a0aec3cbefe8686c4cd77a7cbffa22b83f1085ffcaafdb28b3977ecba5bb002018a83800fcf81ec97163b7d58f9c2455cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gevent-doc \
python310-gevent-doc \
python311-gevent-doc \
python39-gevent-doc"

RDEPENDS:${PN} += ""

inherit rpm
