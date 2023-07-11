SUMMARY = "Microsoft Azure Resource Management bundle"
DESCRIPTION = "This is the Microsoft Azure Resource Management bundle. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package does not contain any code in itself. It installs a set \
of packages that provide management APIs for the various Azure services. \
 \
All packages in this bundle have been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-azure-mgmt-4.0.0-23.6.noarch.rpm"
RPM_HASH = "1720ed06dc5082b6dbd2bc95797c0548b17831511ab32c5129d32556a3a385132ee01cd6c36a4a397c7d8e54bfcfa65205d57685797b8b1c429c8063ed15fa39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt \
python310-azure-mgmt \
python3dist-azure-mgmt"

RDEPENDS:${PN} += "python310-azure-mgmt-advisor \
python310-azure-mgmt-agfood \
python310-azure-mgmt-agrifood \
python310-azure-mgmt-alertsmanagement \
python310-azure-mgmt-apimanagement \
python310-azure-mgmt-app \
python310-azure-mgmt-appconfiguration \
python310-azure-mgmt-applicationinsights \
python310-azure-mgmt-appplatform \
python310-azure-mgmt-attestation \
python310-azure-mgmt-authorization \
python310-azure-mgmt-automanage \
python310-azure-mgmt-automation \
python310-azure-mgmt-avs \
python310-azure-mgmt-azureadb2c \
python310-azure-mgmt-azurestack \
python310-azure-mgmt-azurestackhci \
python310-azure-mgmt-baremetalinfrastructure \
python310-azure-mgmt-batch \
python310-azure-mgmt-batchai \
python310-azure-mgmt-billing \
python310-azure-mgmt-botservice \
python310-azure-mgmt-cdn \
python310-azure-mgmt-chaos \
python310-azure-mgmt-cognitiveservices \
python310-azure-mgmt-commerce \
python310-azure-mgmt-communication \
python310-azure-mgmt-compute \
python310-azure-mgmt-confluent \
python310-azure-mgmt-connectedvmware \
python310-azure-mgmt-consumption \
python310-azure-mgmt-containerinstance \
python310-azure-mgmt-containerregistry \
python310-azure-mgmt-containerservice \
python310-azure-mgmt-core \
python310-azure-mgmt-cosmosdb \
python310-azure-mgmt-costmanagement \
python310-azure-mgmt-customproviders \
python310-azure-mgmt-dashboard \
python310-azure-mgmt-databox \
python310-azure-mgmt-databoxedge \
python310-azure-mgmt-databricks \
python310-azure-mgmt-datadog \
python310-azure-mgmt-datafactory \
python310-azure-mgmt-datalake-analytics \
python310-azure-mgmt-datalake-nspkg \
python310-azure-mgmt-datalake-store \
python310-azure-mgmt-datamigration \
python310-azure-mgmt-dataprotection \
python310-azure-mgmt-datashare \
python310-azure-mgmt-deploymentmanager \
python310-azure-mgmt-deviceupdate \
python310-azure-mgmt-devspaces \
python310-azure-mgmt-devtestlabs \
python310-azure-mgmt-digitaltwins \
python310-azure-mgmt-dns \
python310-azure-mgmt-documentdb \
python310-azure-mgmt-edgegateway \
python310-azure-mgmt-edgeorder \
python310-azure-mgmt-elastic \
python310-azure-mgmt-eventgrid \
python310-azure-mgmt-eventhub \
python310-azure-mgmt-extendedlocation \
python310-azure-mgmt-fluidrelay \
python310-azure-mgmt-frontdoor \
python310-azure-mgmt-guestconfig \
python310-azure-mgmt-hanaonazure \
python310-azure-mgmt-hdinsight \
python310-azure-mgmt-healthcareapis \
python310-azure-mgmt-hybridcompute \
python310-azure-mgmt-hybridkubernetes \
python310-azure-mgmt-hybridnetwork \
python310-azure-mgmt-imagebuilder \
python310-azure-mgmt-iotcentral \
python310-azure-mgmt-iothub \
python310-azure-mgmt-iothubprovisioningservices \
python310-azure-mgmt-keyvault \
python310-azure-mgmt-kubernetesconfiguration \
python310-azure-mgmt-kusto \
python310-azure-mgmt-labservices \
python310-azure-mgmt-loadtestservice \
python310-azure-mgmt-loganalytics \
python310-azure-mgmt-logic \
python310-azure-mgmt-logz \
python310-azure-mgmt-machinelearningcompute \
python310-azure-mgmt-machinelearningservices \
python310-azure-mgmt-maintenance \
python310-azure-mgmt-managedservices \
python310-azure-mgmt-managementgroups \
python310-azure-mgmt-managementpartner \
python310-azure-mgmt-maps \
python310-azure-mgmt-marketplaceordering \
python310-azure-mgmt-media \
python310-azure-mgmt-mixedreality \
python310-azure-mgmt-mobilenetwork \
python310-azure-mgmt-monitor \
python310-azure-mgmt-msi \
python310-azure-mgmt-netapp \
python310-azure-mgmt-network \
python310-azure-mgmt-notificationhubs \
python310-azure-mgmt-nspkg \
python310-azure-mgmt-oep \
python310-azure-mgmt-orbital \
python310-azure-mgmt-peering \
python310-azure-mgmt-policyinsights \
python310-azure-mgmt-portal \
python310-azure-mgmt-powerbidedicated \
python310-azure-mgmt-powerbiembedded \
python310-azure-mgmt-privatedns \
python310-azure-mgmt-purview \
python310-azure-mgmt-quantum \
python310-azure-mgmt-quota \
python310-azure-mgmt-rdbms \
python310-azure-mgmt-recoveryservices \
python310-azure-mgmt-recoveryservicesbackup \
python310-azure-mgmt-recoveryservicessiterecovery \
python310-azure-mgmt-redhatopenshift \
python310-azure-mgmt-redis \
python310-azure-mgmt-redisenterprise \
python310-azure-mgmt-regionmove \
python310-azure-mgmt-relay \
python310-azure-mgmt-reservations \
python310-azure-mgmt-resource \
python310-azure-mgmt-resourceconnector \
python310-azure-mgmt-resourcegraph \
python310-azure-mgmt-resourcehealth \
python310-azure-mgmt-resourcemover \
python310-azure-mgmt-scheduler \
python310-azure-mgmt-search \
python310-azure-mgmt-security \
python310-azure-mgmt-securityinsight \
python310-azure-mgmt-serialconsole \
python310-azure-mgmt-servermanager \
python310-azure-mgmt-servicebus \
python310-azure-mgmt-servicefabric \
python310-azure-mgmt-servicefabricmanagedclusters \
python310-azure-mgmt-servicelinker \
python310-azure-mgmt-signalr \
python310-azure-mgmt-sql \
python310-azure-mgmt-sqlvirtualmachine \
python310-azure-mgmt-storage \
python310-azure-mgmt-storagecache \
python310-azure-mgmt-storageimportexport \
python310-azure-mgmt-storagepool \
python310-azure-mgmt-storagesync \
python310-azure-mgmt-streamanalytics \
python310-azure-mgmt-subscription \
python310-azure-mgmt-support \
python310-azure-mgmt-synapse \
python310-azure-mgmt-testbase \
python310-azure-mgmt-timeseriesinsights \
python310-azure-mgmt-trafficmanager \
python310-azure-mgmt-videoanalyzer \
python310-azure-mgmt-vmwarecloudsimple \
python310-azure-mgmt-web \
python310-azure-mgmt-webpubsub"

inherit rpm
