SUMMARY = "Microsoft Application Insights for Python"
DESCRIPTION = "This project extends the Application Insights API surface to support Python. \
 \
Application Insights is a service that allows developers to keep their \
application available, performing and succeeding. This Python module will \
allow you to send telemetry of various kinds (event, trace, exception, etc.) \
to the Application Insights service where they can be visualized in the \
Azure Portal."
LICENSE = "MIT"

PV = "0.11.10"

RPM_NAME = "python39-applicationinsights-0.11.10-1.9.noarch.rpm"
RPM_HASH = "a1e59f6136e6d650a8323a9ca41b5607713d8724856fde68045c3f776212ec3cc425ac89a3a1ab5ed234bf67f4f9086026f3168996b2a09388f7dc50504d5607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-applicationinsights \
python39-applicationinsights \
python3dist-applicationinsights"

RDEPENDS:${PN} += "python-abi"

inherit rpm
