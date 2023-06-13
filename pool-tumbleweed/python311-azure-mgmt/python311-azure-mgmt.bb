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

RPM_NAME = "python311-azure-mgmt-4.0.0-23.5.noarch.rpm"
RPM_HASH = "9e7bb2c3793734dbb32de579c8768c99c2b95d7f7b1adb3534e09e2d8c7e2315c1f9cd533c80074d58c359ab6b92aebd652bbc89cd97781cd242c593371d3a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt) \
python311-azure-mgmt \
python3dist(azure-mgmt)"

RDEPENDS:${PN} += "python311-azure-mgmt-advisor \
python311-azure-mgmt-agfood \
python311-azure-mgmt-agrifood \
python311-azure-mgmt-alertsmanagement \
python311-azure-mgmt-apimanagement \
python311-azure-mgmt-app \
python311-azure-mgmt-appconfiguration \
python311-azure-mgmt-applicationinsights \
python311-azure-mgmt-appplatform \
python311-azure-mgmt-attestation \
python311-azure-mgmt-authorization \
python311-azure-mgmt-automanage \
python311-azure-mgmt-automation \
python311-azure-mgmt-avs \
python311-azure-mgmt-azureadb2c \
python311-azure-mgmt-azurestack \
python311-azure-mgmt-azurestackhci \
python311-azure-mgmt-baremetalinfrastructure \
python311-azure-mgmt-batch \
python311-azure-mgmt-batchai \
python311-azure-mgmt-billing \
python311-azure-mgmt-botservice \
python311-azure-mgmt-cdn \
python311-azure-mgmt-chaos \
python311-azure-mgmt-cognitiveservices \
python311-azure-mgmt-commerce \
python311-azure-mgmt-communication \
python311-azure-mgmt-compute \
python311-azure-mgmt-confluent \
python311-azure-mgmt-connectedvmware \
python311-azure-mgmt-consumption \
python311-azure-mgmt-containerinstance \
python311-azure-mgmt-containerregistry \
python311-azure-mgmt-containerservice \
python311-azure-mgmt-core \
python311-azure-mgmt-cosmosdb \
python311-azure-mgmt-costmanagement \
python311-azure-mgmt-customproviders \
python311-azure-mgmt-dashboard \
python311-azure-mgmt-databox \
python311-azure-mgmt-databoxedge \
python311-azure-mgmt-databricks \
python311-azure-mgmt-datadog \
python311-azure-mgmt-datafactory \
python311-azure-mgmt-datalake-analytics \
python311-azure-mgmt-datalake-nspkg \
python311-azure-mgmt-datalake-store \
python311-azure-mgmt-datamigration \
python311-azure-mgmt-dataprotection \
python311-azure-mgmt-datashare \
python311-azure-mgmt-deploymentmanager \
python311-azure-mgmt-deviceupdate \
python311-azure-mgmt-devspaces \
python311-azure-mgmt-devtestlabs \
python311-azure-mgmt-digitaltwins \
python311-azure-mgmt-dns \
python311-azure-mgmt-documentdb \
python311-azure-mgmt-edgegateway \
python311-azure-mgmt-edgeorder \
python311-azure-mgmt-elastic \
python311-azure-mgmt-eventgrid \
python311-azure-mgmt-eventhub \
python311-azure-mgmt-extendedlocation \
python311-azure-mgmt-fluidrelay \
python311-azure-mgmt-frontdoor \
python311-azure-mgmt-guestconfig \
python311-azure-mgmt-hanaonazure \
python311-azure-mgmt-hdinsight \
python311-azure-mgmt-healthcareapis \
python311-azure-mgmt-hybridcompute \
python311-azure-mgmt-hybridkubernetes \
python311-azure-mgmt-hybridnetwork \
python311-azure-mgmt-imagebuilder \
python311-azure-mgmt-iotcentral \
python311-azure-mgmt-iothub \
python311-azure-mgmt-iothubprovisioningservices \
python311-azure-mgmt-keyvault \
python311-azure-mgmt-kubernetesconfiguration \
python311-azure-mgmt-kusto \
python311-azure-mgmt-labservices \
python311-azure-mgmt-loadtestservice \
python311-azure-mgmt-loganalytics \
python311-azure-mgmt-logic \
python311-azure-mgmt-logz \
python311-azure-mgmt-machinelearningcompute \
python311-azure-mgmt-machinelearningservices \
python311-azure-mgmt-maintenance \
python311-azure-mgmt-managedservices \
python311-azure-mgmt-managementgroups \
python311-azure-mgmt-managementpartner \
python311-azure-mgmt-maps \
python311-azure-mgmt-marketplaceordering \
python311-azure-mgmt-media \
python311-azure-mgmt-mixedreality \
python311-azure-mgmt-mobilenetwork \
python311-azure-mgmt-monitor \
python311-azure-mgmt-msi \
python311-azure-mgmt-netapp \
python311-azure-mgmt-network \
python311-azure-mgmt-notificationhubs \
python311-azure-mgmt-nspkg \
python311-azure-mgmt-oep \
python311-azure-mgmt-orbital \
python311-azure-mgmt-peering \
python311-azure-mgmt-policyinsights \
python311-azure-mgmt-portal \
python311-azure-mgmt-powerbidedicated \
python311-azure-mgmt-powerbiembedded \
python311-azure-mgmt-privatedns \
python311-azure-mgmt-purview \
python311-azure-mgmt-quantum \
python311-azure-mgmt-quota \
python311-azure-mgmt-rdbms \
python311-azure-mgmt-recoveryservices \
python311-azure-mgmt-recoveryservicesbackup \
python311-azure-mgmt-recoveryservicessiterecovery \
python311-azure-mgmt-redhatopenshift \
python311-azure-mgmt-redis \
python311-azure-mgmt-redisenterprise \
python311-azure-mgmt-regionmove \
python311-azure-mgmt-relay \
python311-azure-mgmt-reservations \
python311-azure-mgmt-resource \
python311-azure-mgmt-resourceconnector \
python311-azure-mgmt-resourcegraph \
python311-azure-mgmt-resourcehealth \
python311-azure-mgmt-resourcemover \
python311-azure-mgmt-scheduler \
python311-azure-mgmt-search \
python311-azure-mgmt-security \
python311-azure-mgmt-securityinsight \
python311-azure-mgmt-serialconsole \
python311-azure-mgmt-servermanager \
python311-azure-mgmt-servicebus \
python311-azure-mgmt-servicefabric \
python311-azure-mgmt-servicefabricmanagedclusters \
python311-azure-mgmt-servicelinker \
python311-azure-mgmt-signalr \
python311-azure-mgmt-sql \
python311-azure-mgmt-sqlvirtualmachine \
python311-azure-mgmt-storage \
python311-azure-mgmt-storagecache \
python311-azure-mgmt-storageimportexport \
python311-azure-mgmt-storagepool \
python311-azure-mgmt-storagesync \
python311-azure-mgmt-streamanalytics \
python311-azure-mgmt-subscription \
python311-azure-mgmt-support \
python311-azure-mgmt-synapse \
python311-azure-mgmt-testbase \
python311-azure-mgmt-timeseriesinsights \
python311-azure-mgmt-trafficmanager \
python311-azure-mgmt-videoanalyzer \
python311-azure-mgmt-vmwarecloudsimple \
python311-azure-mgmt-web \
python311-azure-mgmt-webpubsub"

inherit rpm
