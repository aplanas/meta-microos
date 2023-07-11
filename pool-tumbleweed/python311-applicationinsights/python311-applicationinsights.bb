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

RPM_NAME = "python311-applicationinsights-0.11.10-1.9.noarch.rpm"
RPM_HASH = "5510ae34556c05bdb01e6ab0d4518c2066616b72c5aec43edca64f6d288ec6d4ebb40bdaf6c4922b832b126d3f89576dc4068511e20844719c13b5b3bbc7b5ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-applicationinsights \
python3.11dist-applicationinsights \
python311-applicationinsights \
python3dist-applicationinsights"

RDEPENDS:${PN} += "python-abi"

inherit rpm
