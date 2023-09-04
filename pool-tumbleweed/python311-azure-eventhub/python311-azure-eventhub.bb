SUMMARY = "Azure Event Hubs client library for Python"
DESCRIPTION = "Azure Event Hubs is a highly scalable publish-subscribe service that can ingest millions \
of events per second and stream them to multiple consumers. This lets you process and \
analyze the massive amounts of data produced by your connected devices and applications. \
Once Event Hubs has collected the data, you can retrieve, transform, and store it by using \
any real-time analytics provider or with batching/storage adapters. If you would like to \
know more about Azure Event Hubs, you may wish to review: \
[What is Event Hubs](https://docs.microsoft.com/en-us/azure/event-hubs/event-hubs-about)? \
 \
The Azure Event Hubs client library allows for publishing and consuming of Azure Event \
Hubs events and may be used to: \
 \
 - Emit telemetry about your application for business intelligence and diagnostic purposes. \
 - Publish facts about the state of your application which interested parties may observe \
   and use as a trigger for taking action. \
 - Observe interesting operations and interactions happening within your business or other \
   ecosystem, allowing loosely coupled systems to interact without the need to bind them together. \
 - Receive events from one or more publishers, transform them to better meet the needs of \
   your ecosystem, then publish the transformed events to a new stream for consumers to observe."
LICENSE = "MIT"

PV = "5.11.4"

RPM_NAME = "python311-azure-eventhub-5.11.4-1.1.noarch.rpm"
RPM_HASH = "b2cea18ff6268364928c6b7dd109c1426abf24766f594128fe062d2cc898ba9e57515cb1dfb92727701c044a05b17771db4ad97470ffe36c3225aa0fdbe3f9b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-eventhub \
python3.11dist-azure-eventhub \
python311-azure-eventhub \
python3dist-azure-eventhub"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-typing-extensions"

inherit rpm
