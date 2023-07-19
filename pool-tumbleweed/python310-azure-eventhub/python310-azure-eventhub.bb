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

PV = "5.11.3"

RPM_NAME = "python310-azure-eventhub-5.11.3-1.1.noarch.rpm"
RPM_HASH = "0d59530217eb8f8ed588e8bc7b8bff0416692fd9c53c95d97c85be7b7cc5550de584aaa777f8b0fbbabc197172527ca49d362c1545f9a78d9c3c75f6d8f9d8d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-eventhub \
python310-azure-eventhub \
python3dist-azure-eventhub"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-typing-extensions"

inherit rpm
