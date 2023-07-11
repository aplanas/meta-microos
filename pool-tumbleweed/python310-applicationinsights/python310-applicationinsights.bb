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

RPM_NAME = "python310-applicationinsights-0.11.10-1.9.noarch.rpm"
RPM_HASH = "719beb6b147bd37a817ac3e2875ff2d4a27ce1d8cbd1de4ea330add1c588ea7efa4fbfaa8fc0deff49411a535876235314ae85091d9666143498c6a5898030b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-applicationinsights \
python310-applicationinsights \
python3dist-applicationinsights"

RDEPENDS:${PN} += "python-abi"

inherit rpm
