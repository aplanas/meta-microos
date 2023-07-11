SUMMARY = "Python @deprecated decorator"
DESCRIPTION = "If you need to mark a function or a method as deprecated, \
you can use the ``@deprecated`` decorator."
LICENSE = "MIT"

PV = "1.2.14"

RPM_NAME = "python39-Deprecated-1.2.14-1.3.noarch.rpm"
RPM_HASH = "adc7859ca6c62fbca6af050a3e6e0a7335d3e681de1d2cbfbebe4e42d92c0061901a987ae3eb36a08023b673adf3273f17f90ae3e5bd6bc718f25a65f87a2739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-deprecated \
python39-Deprecated \
python39-deprecated \
python3dist-deprecated"

RDEPENDS:${PN} += "python-abi \
python39-wrapt"

inherit rpm
