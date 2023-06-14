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

RPM_NAME = "python39-azure-mgmt-4.0.0-23.5.noarch.rpm"
RPM_HASH = "460453594dcd28f86a9f4fbd8ed6bc293c27020b4613c766f506c2cb00227dd25c40e17f62d0756105502ad8485a5d01773cb5da9d4cf411943559fa4120ca14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt \
python39-azure-mgmt \
python3dist-azure-mgmt"

RDEPENDS:${PN} += "python39-azure-mgmt-advisor \
python39-azure-mgmt-agfood \
python39-azure-mgmt-agrifood \
python39-azure-mgmt-alertsmanagement \
python39-azure-mgmt-apimanagement \
python39-azure-mgmt-app \
python39-azure-mgmt-appconfiguration \
python39-azure-mgmt-applicationinsights \
python39-azure-mgmt-appplatform \
python39-azure-mgmt-attestation \
python39-azure-mgmt-authorization \
python39-azure-mgmt-automanage \
python39-azure-mgmt-automation \
python39-azure-mgmt-avs \
python39-azure-mgmt-azureadb2c \
python39-azure-mgmt-azurestack \
python39-azure-mgmt-azurestackhci \
python39-azure-mgmt-baremetalinfrastructure \
python39-azure-mgmt-batch \
python39-azure-mgmt-batchai \
python39-azure-mgmt-billing \
python39-azure-mgmt-botservice \
python39-azure-mgmt-cdn \
python39-azure-mgmt-chaos \
python39-azure-mgmt-cognitiveservices \
python39-azure-mgmt-commerce \
python39-azure-mgmt-communication \
python39-azure-mgmt-compute \
python39-azure-mgmt-confluent \
python39-azure-mgmt-connectedvmware \
python39-azure-mgmt-consumption \
python39-azure-mgmt-containerinstance \
python39-azure-mgmt-containerregistry \
python39-azure-mgmt-containerservice \
python39-azure-mgmt-core \
python39-azure-mgmt-cosmosdb \
python39-azure-mgmt-costmanagement \
python39-azure-mgmt-customproviders \
python39-azure-mgmt-dashboard \
python39-azure-mgmt-databox \
python39-azure-mgmt-databoxedge \
python39-azure-mgmt-databricks \
python39-azure-mgmt-datadog \
python39-azure-mgmt-datafactory \
python39-azure-mgmt-datalake-analytics \
python39-azure-mgmt-datalake-nspkg \
python39-azure-mgmt-datalake-store \
python39-azure-mgmt-datamigration \
python39-azure-mgmt-dataprotection \
python39-azure-mgmt-datashare \
python39-azure-mgmt-deploymentmanager \
python39-azure-mgmt-deviceupdate \
python39-azure-mgmt-devspaces \
python39-azure-mgmt-devtestlabs \
python39-azure-mgmt-digitaltwins \
python39-azure-mgmt-dns \
python39-azure-mgmt-documentdb \
python39-azure-mgmt-edgegateway \
python39-azure-mgmt-edgeorder \
python39-azure-mgmt-elastic \
python39-azure-mgmt-eventgrid \
python39-azure-mgmt-eventhub \
python39-azure-mgmt-extendedlocation \
python39-azure-mgmt-fluidrelay \
python39-azure-mgmt-frontdoor \
python39-azure-mgmt-guestconfig \
python39-azure-mgmt-hanaonazure \
python39-azure-mgmt-hdinsight \
python39-azure-mgmt-healthcareapis \
python39-azure-mgmt-hybridcompute \
python39-azure-mgmt-hybridkubernetes \
python39-azure-mgmt-hybridnetwork \
python39-azure-mgmt-imagebuilder \
python39-azure-mgmt-iotcentral \
python39-azure-mgmt-iothub \
python39-azure-mgmt-iothubprovisioningservices \
python39-azure-mgmt-keyvault \
python39-azure-mgmt-kubernetesconfiguration \
python39-azure-mgmt-kusto \
python39-azure-mgmt-labservices \
python39-azure-mgmt-loadtestservice \
python39-azure-mgmt-loganalytics \
python39-azure-mgmt-logic \
python39-azure-mgmt-logz \
python39-azure-mgmt-machinelearningcompute \
python39-azure-mgmt-machinelearningservices \
python39-azure-mgmt-maintenance \
python39-azure-mgmt-managedservices \
python39-azure-mgmt-managementgroups \
python39-azure-mgmt-managementpartner \
python39-azure-mgmt-maps \
python39-azure-mgmt-marketplaceordering \
python39-azure-mgmt-media \
python39-azure-mgmt-mixedreality \
python39-azure-mgmt-mobilenetwork \
python39-azure-mgmt-monitor \
python39-azure-mgmt-msi \
python39-azure-mgmt-netapp \
python39-azure-mgmt-network \
python39-azure-mgmt-notificationhubs \
python39-azure-mgmt-nspkg \
python39-azure-mgmt-oep \
python39-azure-mgmt-orbital \
python39-azure-mgmt-peering \
python39-azure-mgmt-policyinsights \
python39-azure-mgmt-portal \
python39-azure-mgmt-powerbidedicated \
python39-azure-mgmt-powerbiembedded \
python39-azure-mgmt-privatedns \
python39-azure-mgmt-purview \
python39-azure-mgmt-quantum \
python39-azure-mgmt-quota \
python39-azure-mgmt-rdbms \
python39-azure-mgmt-recoveryservices \
python39-azure-mgmt-recoveryservicesbackup \
python39-azure-mgmt-recoveryservicessiterecovery \
python39-azure-mgmt-redhatopenshift \
python39-azure-mgmt-redis \
python39-azure-mgmt-redisenterprise \
python39-azure-mgmt-regionmove \
python39-azure-mgmt-relay \
python39-azure-mgmt-reservations \
python39-azure-mgmt-resource \
python39-azure-mgmt-resourceconnector \
python39-azure-mgmt-resourcegraph \
python39-azure-mgmt-resourcehealth \
python39-azure-mgmt-resourcemover \
python39-azure-mgmt-scheduler \
python39-azure-mgmt-search \
python39-azure-mgmt-security \
python39-azure-mgmt-securityinsight \
python39-azure-mgmt-serialconsole \
python39-azure-mgmt-servermanager \
python39-azure-mgmt-servicebus \
python39-azure-mgmt-servicefabric \
python39-azure-mgmt-servicefabricmanagedclusters \
python39-azure-mgmt-servicelinker \
python39-azure-mgmt-signalr \
python39-azure-mgmt-sql \
python39-azure-mgmt-sqlvirtualmachine \
python39-azure-mgmt-storage \
python39-azure-mgmt-storagecache \
python39-azure-mgmt-storageimportexport \
python39-azure-mgmt-storagepool \
python39-azure-mgmt-storagesync \
python39-azure-mgmt-streamanalytics \
python39-azure-mgmt-subscription \
python39-azure-mgmt-support \
python39-azure-mgmt-synapse \
python39-azure-mgmt-testbase \
python39-azure-mgmt-timeseriesinsights \
python39-azure-mgmt-trafficmanager \
python39-azure-mgmt-videoanalyzer \
python39-azure-mgmt-vmwarecloudsimple \
python39-azure-mgmt-web \
python39-azure-mgmt-webpubsub"

inherit rpm
