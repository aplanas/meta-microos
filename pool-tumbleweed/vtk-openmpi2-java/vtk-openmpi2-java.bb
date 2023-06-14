SUMMARY = "Java bindings for VTK"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This package provides java bindings for VTK."
LICENSE = "BSD-3-Clause"

PV = "9.2.6"

RPM_NAME = "vtk-openmpi2-java-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "946ce54011300e9032db5b76e5b4b0e74ad850eb11848ab457b436782be7ee826517b81de1189ed3df73888ece83b49b00679e3995b561995501d4e3e887f5e4"

RPROVIDES:${PN} += "libvtkChartsCoreJava.so \
libvtkCommonColorJava.so \
libvtkCommonComputationalGeometryJava.so \
libvtkCommonCoreJava.so \
libvtkCommonDataModelJava.so \
libvtkCommonExecutionModelJava.so \
libvtkCommonMathJava.so \
libvtkCommonMiscJava.so \
libvtkCommonPythonJava.so \
libvtkCommonSystemJava.so \
libvtkCommonTransformsJava.so \
libvtkDomainsChemistryJava.so \
libvtkDomainsChemistryOpenGL2Java.so \
libvtkDomainsParallelChemistryJava.so \
libvtkFiltersAMRJava.so \
libvtkFiltersCoreJava.so \
libvtkFiltersExtractionJava.so \
libvtkFiltersFlowPathsJava.so \
libvtkFiltersGeneralJava.so \
libvtkFiltersGenericJava.so \
libvtkFiltersGeometryJava.so \
libvtkFiltersHybridJava.so \
libvtkFiltersHyperTreeJava.so \
libvtkFiltersImagingJava.so \
libvtkFiltersModelingJava.so \
libvtkFiltersParallelGeometryJava.so \
libvtkFiltersParallelImagingJava.so \
libvtkFiltersParallelJava.so \
libvtkFiltersParallelMPIJava.so \
libvtkFiltersParallelVerdictJava.so \
libvtkFiltersPointsJava.so \
libvtkFiltersProgrammableJava.so \
libvtkFiltersPythonJava.so \
libvtkFiltersSMPJava.so \
libvtkFiltersSelectionJava.so \
libvtkFiltersSourcesJava.so \
libvtkFiltersStatisticsJava.so \
libvtkFiltersTextureJava.so \
libvtkFiltersTopologyJava.so \
libvtkFiltersVerdictJava.so \
libvtkGeovisCoreJava.so \
libvtkIOAMRJava.so \
libvtkIOAsynchronousJava.so \
libvtkIOCGNSReaderJava.so \
libvtkIOCONVERGECFDJava.so \
libvtkIOCesium3DTilesJava.so \
libvtkIOChemistryJava.so \
libvtkIOCityGMLJava.so \
libvtkIOCoreJava.so \
libvtkIOEnSightJava.so \
libvtkIOExodusJava.so \
libvtkIOExportJava.so \
libvtkIOExportPDFJava.so \
libvtkIOGeometryJava.so \
libvtkIOHDFJava.so \
libvtkIOImageJava.so \
libvtkIOImportJava.so \
libvtkIOInfovisJava.so \
libvtkIOLSDynaJava.so \
libvtkIOLegacyJava.so \
libvtkIOMINCJava.so \
libvtkIOMPIImageJava.so \
libvtkIOMPIParallelJava.so \
libvtkIOMovieJava.so \
libvtkIONetCDFJava.so \
libvtkIOOggTheoraJava.so \
libvtkIOPLYJava.so \
libvtkIOParallelJava.so \
libvtkIOParallelNetCDFJava.so \
libvtkIOParallelXMLJava.so \
libvtkIOSQLJava.so \
libvtkIOSegYJava.so \
libvtkIOTecplotTableJava.so \
libvtkIOVeraOutJava.so \
libvtkIOVideoJava.so \
libvtkIOXMLJava.so \
libvtkIOXMLParserJava.so \
libvtkImagingColorJava.so \
libvtkImagingCoreJava.so \
libvtkImagingFourierJava.so \
libvtkImagingGeneralJava.so \
libvtkImagingHybridJava.so \
libvtkImagingMathJava.so \
libvtkImagingMorphologicalJava.so \
libvtkImagingSourcesJava.so \
libvtkImagingStatisticsJava.so \
libvtkImagingStencilJava.so \
libvtkInfovisCoreJava.so \
libvtkInfovisLayoutJava.so \
libvtkInteractionImageJava.so \
libvtkInteractionStyleJava.so \
libvtkInteractionWidgetsJava.so \
libvtkParallelCoreJava.so \
libvtkParallelMPI4PyJava.so \
libvtkParallelMPIJava.so \
libvtkPythonContext2DJava.so \
libvtkRenderingAnnotationJava.so \
libvtkRenderingContext2DJava.so \
libvtkRenderingContextOpenGL2Java.so \
libvtkRenderingCoreJava.so \
libvtkRenderingFreeTypeJava.so \
libvtkRenderingHyperTreeGridJava.so \
libvtkRenderingImageJava.so \
libvtkRenderingLODJava.so \
libvtkRenderingLabelJava.so \
libvtkRenderingOpenGL2Java.so \
libvtkRenderingQtJava.so \
libvtkRenderingSceneGraphJava.so \
libvtkRenderingUIJava.so \
libvtkRenderingVolumeJava.so \
libvtkRenderingVolumeOpenGL2Java.so \
libvtkRenderingVtkJSJava.so \
libvtkTestingRenderingJava.so \
libvtkViewsContext2DJava.so \
libvtkViewsCoreJava.so \
libvtkViewsInfovisJava.so \
vtk-openmpi2-java"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjawt.so \
libm.so.6 \
libstdc++.so.6 \
libvtk1-openmpi2 \
libvtkChartsCore.so.1 \
libvtkCommonColor.so.1 \
libvtkCommonComputationalGeometry.so.1 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonMath.so.1 \
libvtkCommonMisc.so.1 \
libvtkCommonSystem.so.1 \
libvtkCommonTransforms.so.1 \
libvtkDomainsChemistry.so.1 \
libvtkDomainsChemistryOpenGL2.so.1 \
libvtkDomainsParallelChemistry.so.1 \
libvtkFiltersAMR.so.1 \
libvtkFiltersCore.so.1 \
libvtkFiltersExtraction.so.1 \
libvtkFiltersFlowPaths.so.1 \
libvtkFiltersGeneral.so.1 \
libvtkFiltersGeneric.so.1 \
libvtkFiltersGeometry.so.1 \
libvtkFiltersHybrid.so.1 \
libvtkFiltersHyperTree.so.1 \
libvtkFiltersImaging.so.1 \
libvtkFiltersModeling.so.1 \
libvtkFiltersParallel.so.1 \
libvtkFiltersParallelGeometry.so.1 \
libvtkFiltersParallelImaging.so.1 \
libvtkFiltersParallelMPI.so.1 \
libvtkFiltersParallelVerdict.so.1 \
libvtkFiltersPoints.so.1 \
libvtkFiltersProgrammable.so.1 \
libvtkFiltersSMP.so.1 \
libvtkFiltersSelection.so.1 \
libvtkFiltersSources.so.1 \
libvtkFiltersStatistics.so.1 \
libvtkFiltersTexture.so.1 \
libvtkFiltersTopology.so.1 \
libvtkFiltersVerdict.so.1 \
libvtkGeovisCore.so.1 \
libvtkIOAMR.so.1 \
libvtkIOAsynchronous.so.1 \
libvtkIOCGNSReader.so.1 \
libvtkIOCONVERGECFD.so.1 \
libvtkIOCesium3DTiles.so.1 \
libvtkIOChemistry.so.1 \
libvtkIOCityGML.so.1 \
libvtkIOCore.so.1 \
libvtkIOEnSight.so.1 \
libvtkIOExodus.so.1 \
libvtkIOExport.so.1 \
libvtkIOExportPDF.so.1 \
libvtkIOGeometry.so.1 \
libvtkIOHDF.so.1 \
libvtkIOImage.so.1 \
libvtkIOImport.so.1 \
libvtkIOInfovis.so.1 \
libvtkIOLSDyna.so.1 \
libvtkIOLegacy.so.1 \
libvtkIOMINC.so.1 \
libvtkIOMPIImage.so.1 \
libvtkIOMPIParallel.so.1 \
libvtkIOMovie.so.1 \
libvtkIONetCDF.so.1 \
libvtkIOOggTheora.so.1 \
libvtkIOPLY.so.1 \
libvtkIOParallel.so.1 \
libvtkIOParallelNetCDF.so.1 \
libvtkIOParallelXML.so.1 \
libvtkIOSQL.so.1 \
libvtkIOSegY.so.1 \
libvtkIOTecplotTable.so.1 \
libvtkIOVeraOut.so.1 \
libvtkIOVideo.so.1 \
libvtkIOXML.so.1 \
libvtkIOXMLParser.so.1 \
libvtkImagingColor.so.1 \
libvtkImagingCore.so.1 \
libvtkImagingFourier.so.1 \
libvtkImagingGeneral.so.1 \
libvtkImagingHybrid.so.1 \
libvtkImagingMath.so.1 \
libvtkImagingMorphological.so.1 \
libvtkImagingSources.so.1 \
libvtkImagingStatistics.so.1 \
libvtkImagingStencil.so.1 \
libvtkInfovisCore.so.1 \
libvtkInfovisLayout.so.1 \
libvtkInteractionImage.so.1 \
libvtkInteractionStyle.so.1 \
libvtkInteractionWidgets.so.1 \
libvtkJava.so.1 \
libvtkParallelCore.so.1 \
libvtkParallelMPI.so.1 \
libvtkRenderingAnnotation.so.1 \
libvtkRenderingContext2D.so.1 \
libvtkRenderingContextOpenGL2.so.1 \
libvtkRenderingCore.so.1 \
libvtkRenderingFreeType.so.1 \
libvtkRenderingHyperTreeGrid.so.1 \
libvtkRenderingImage.so.1 \
libvtkRenderingLOD.so.1 \
libvtkRenderingLabel.so.1 \
libvtkRenderingOpenGL2.so.1 \
libvtkRenderingQt.so.1 \
libvtkRenderingSceneGraph.so.1 \
libvtkRenderingUI.so.1 \
libvtkRenderingVolume.so.1 \
libvtkRenderingVolumeOpenGL2.so.1 \
libvtkRenderingVtkJS.so.1 \
libvtkTestingRendering.so.1 \
libvtkViewsContext2D.so.1 \
libvtkViewsCore.so.1 \
libvtkViewsInfovis.so.1 \
libvtksys.so.1"

inherit rpm
