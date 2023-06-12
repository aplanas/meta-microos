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

RPM_NAME = "python311-applicationinsights-0.11.10-1.8.noarch.rpm"
RPM_HASH = "3705bc7087244d89c0187e048d401ebea17221c221588b6ab4e6b4947e974a335df6561f21be819dece99df42d3748fecd0660f1232a52692e1065e4cbf44e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(applicationinsights) \
python311-applicationinsights \
python3dist(applicationinsights)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
