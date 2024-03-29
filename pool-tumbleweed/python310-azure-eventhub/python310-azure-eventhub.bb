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

RPM_NAME = "python310-azure-eventhub-5.11.4-1.1.noarch.rpm"
RPM_HASH = "bed469a00e3eb287ee607fe96b1b8596cfc0d2125c39a00d82833709ed7e90e0064fa88e327925ff4f09ed5a7a6b81f2333ea7ed61768152fb6aca5bab2867f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-eventhub \
python310-azure-eventhub \
python3dist-azure-eventhub"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-typing-extensions"

inherit rpm
