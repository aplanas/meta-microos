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

RPM_NAME = "python39-azure-eventhub-5.11.4-1.1.noarch.rpm"
RPM_HASH = "d1f7e877ed017afe6edfe0ccfefa31ce37d90e1f54b62db6c7efba99d5b9b05638a9d8caaae36b87a3075c286b5eeaf2c3e36ed2d9caa515f85601237555798f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-eventhub \
python39-azure-eventhub \
python3dist-azure-eventhub"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-typing-extensions"

inherit rpm
